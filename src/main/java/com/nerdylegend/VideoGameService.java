package com.nerdylegend;

import com.nerdylegend.model.VideoGame;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class VideoGameService {

    @PersistenceContext
    private EntityManager entityManager;


    public long createVideoGame(VideoGame videoGame) {
        entityManager.persist(videoGame);
        return videoGame.getId();
    }

    public List<VideoGame> findAllVideoGames() {
        return  entityManager
                .createNamedQuery("query_find_all_video_games", VideoGame.class)
                .getResultList();
    }

    public VideoGame findVideoGame(Long id) {
        Query q = entityManager.createQuery("select * from VIDEOGAME where ID:videoGameId");
        q.setParameter("videoGameId", id);
        return (VideoGame) q.getSingleResult();
    }

}
