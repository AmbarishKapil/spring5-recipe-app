package guru.springframework.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;

        category.setId(idValue);

        Assert.assertEquals(category.getId(), idValue);
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}