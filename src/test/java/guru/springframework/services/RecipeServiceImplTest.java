package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

public class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {
        Set recipes = new HashSet<Recipe>();
        Recipe recipe = new Recipe();
        recipes.add(recipe);

        Mockito.when(recipeRepository.findAll()).thenReturn(recipes);
        Assert.assertEquals(recipeService.getRecipes().size(),1);
        Mockito.verify(recipeRepository, Mockito.times(1)).findAll();
    }
}