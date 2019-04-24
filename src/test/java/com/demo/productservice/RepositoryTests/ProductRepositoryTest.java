package com.demo.productservice.RepositoryTests;

import com.demo.productservice.repositories.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


import TestUtils.TestSongs;
        import com.musicplayer.musicplayerrestapi.models.Song;
        import com.musicplayer.musicplayerrestapi.repositories.SongRepository;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
        import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
        import org.springframework.test.context.junit4.SpringRunner;

        import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void repoSavesInDB() throws Exception {
        Song song = TestSongs.getSongs().get(0);

        Integer id = testEntityManager.persistAndGetId(song, Integer.class);
        Song foundSong = songRepository.findById(id).orElse(null);
        assertThat(foundSong.getTitle()).isEqualTo(song.getTitle());
    }

    @Test
    public void indSongByName_returnsSongsWithThatName(){
        String title="Africa";

        int size = songRepository.findByTitle(title).size();
        assertThat(size==2);

    }
}