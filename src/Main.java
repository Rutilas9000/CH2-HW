/**
 * @Class: Main
 * @Author: Savion Plater
 * @Course: ITEC2150 - 05, Spring 2024
 * @Written: February 13, 2024
 * Description: The program will be tasked on making baking different types of bread and pastries.
 */
class Bread {
    protected String flour;
    protected String water;
    protected String salt;
    protected String sugar;
    protected String bakingPowder;
    protected String yeast;
    protected String breadName;
    protected String state;
    protected String recipe;

    public Bread() {
        this.flour = "Generic flour";
        this.water = "Water";
        this.salt = "Salt";
        this.sugar = "Sugar";
        this.bakingPowder = "Baking powder";
        this.yeast = "Yeast";
        this.breadName = "Generic Bread";
        this.state = "Not baked";
        this.recipe = "Combine ingredients, knead dough, let it rise, bake.";
    }

    public void bake() {
        if (!state.equals("Baked")) {
            state = "Baked";
            System.out.println(breadName + " is now baked!");
        } else {
            System.out.println(breadName + " is already baked.");
        }
    }

    public String getIngredients() {
        return flour + ", " + water + ", " + salt + ", " + sugar + ", " + bakingPowder + ", " + yeast;
    }

    // Getters, setters, toString method

    @Override
    public String toString() {
        return "Bread{" +
                "flour='" + flour + '\'' +
                ", water='" + water + '\'' +
                ", salt='" + salt + '\'' +
                ", sugar='" + sugar + '\'' +
                ", bakingPowder='" + bakingPowder + '\'' +
                ", yeast='" + yeast + '\'' +
                ", breadName='" + breadName + '\'' +
                ", state='" + state + '\'' +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}

class SourdoughBread extends Bread {
    private String starter;

    public SourdoughBread(String starter) {
        super();
        this.starter = starter;
        this.breadName = "Sourdough Bread";
        this.recipe = "Combine starter, flour, water, salt, knead dough, let it rise, bake.";
    }

    // Getters, setters, toString method
}

class Pastry extends Bread {
    private String filling;

    public Pastry(String filling) {
        super();
        this.filling = filling;
        this.breadName = "Pastry";
        this.recipe = "Make dough, roll out, add filling, shape, bake.";
    }

    // Getters, setters, toString method
}

class WholeWheatBread extends Bread {
    private String seeds;

    public WholeWheatBread(String seeds) {
        super();
        this.seeds = seeds;
        this.breadName = "Whole Wheat Bread";
        this.recipe = "Combine whole wheat flour, water, salt, sugar, seeds, yeast, knead dough, let it rise, bake.";
    }

    // Getters, setters, toString method
}

class Baguette extends Bread {
    private String crust;

    public Baguette(String crust) {
        super();
        this.crust = crust;
        this.breadName = "Baguette";
        this.recipe = "Combine flour, water, salt, yeast, shape, proof, bake.";
    }

    // Getters, setters, toString method
}
class RyeBread extends Bread {
    private String ryeFlour;

    public RyeBread(String ryeFlour) {
        super();
        this.ryeFlour = ryeFlour;
        this.breadName = "Rye Bread";
        this.recipe = "Combine rye flour, water, salt, sugar, yeast, knead dough, let it rise, bake.";
    }

    // Getters, setters, toString method
}

public class Main {
    public static void main(String[] args) {
        Bread genericBread = new Bread();
        SourdoughBread sourdoughBread = new SourdoughBread("Sourdough starter");
        Pastry pastry = new Pastry("Fruit filling");
        WholeWheatBread wholeWheatBread = new WholeWheatBread("Seeds");
        Baguette baguette = new Baguette("Crusty");
        RyeBread ryeBread = new RyeBread("Rye flour");


        System.out.println("Generic Bread Recipe: " + genericBread.recipe);
        System.out.println("Sourdough Bread Recipe: " + sourdoughBread.recipe);
        System.out.println("Pastry Recipe: " + pastry.recipe);
        System.out.println("Whole Wheat Bread Recipe: " + wholeWheatBread.recipe);
        System.out.println("Baguette Recipe: " + baguette.recipe);
        System.out.println("Rye Bread Recipe: " + ryeBread.recipe);

        genericBread.bake();
        sourdoughBread.bake();
        pastry.bake();
        wholeWheatBread.bake();
        baguette.bake();
        ryeBread.bake();
    }
}

