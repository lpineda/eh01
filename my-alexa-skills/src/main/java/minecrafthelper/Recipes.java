/**
    Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is located at
        http://aws.amazon.com/apache2.0/
    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package minecrafthelper;

import java.util.HashMap;
import java.util.Map;

public final class Recipes {

    private static final Map<String, String> recipes = new HashMap<String, String>();

    private Recipes() {
    }

    static {
        recipes.put("snow golem",
                "A snow golem can be created by placing a pumpkin on top of  two snow "
                        + "blocks on the ground.");
        recipes.put("pillar quartz block",
                "A pillar of quartz can be obtained by placing a block of quartz on top of a "
                        + "block of quartz in mine craft.");
        recipes
                .put("firework rocket",
                        "A firework rocket can be crafted by placing a firework star in the left middle "
                                + "square, a piece of paper in the center square, and gunpowder in the right middle "
                                + "square in a crafting table. Similar to a firework star, a firework rocket can have "
                                + "more gunpowder added in the bottom row to increase the duration of a rocket.");
        recipes
                .put("rabbit stew",
                        "Rabbit stew can be crafted by placing cooked rabbit in the top middle square, a "
                                + "carrot in the middle left square, a baked potato in the center square, any "
                                + "type of mushroom in the middle right square, and a bowl in the bottom "
                                + "middle square.");
        recipes.put("cauldron",
                "A cauldron can be created by placing iron ingots in all squares but the top "
                        + "middle and very center squares in a crafting table.");
        recipes
                .put("stone shovel",
                        "All types of shovels can be crafted by placing the desired material in the top "
                                + "middle square, and then sticks in the two squares directly beneath that "
                                + "in a crafting table.");
        recipes.put("red carpet",
                "Any type of carpet can be crafted by placing two wool, of the same color, next "
                        + "to each other in a crafting window.");
        recipes
                .put("book and quill",
                        "A book and quill can be crafted by placing a book in the middle left square, an "
                                + "ink sac in the very center square, and a feather in the bottom middle square"
                                + " in a crafting table.");
        recipes.put("item frame",
                "An item frame can be crafted by placing leather in the very center square, and "
                        + "eight sticks surrounding it.");
        recipes.put("map",
                "A map can be crafted by placing a compass in the middle square and eight "
                        + "pieces of paper surrounding it.");
        recipes.put("sticky piston",
                "A sticky piston can be crafted by placing a slime ball on top of a piston "
                        + "in a crafting window");
        recipes.put("bread",
                "Bread can be crafted by placing three wheat across a row in a crafting table.");
        recipes
                .put("wooden pick ax",
                        "All types of pick axs can be crafted by placing three of the desired material"
                                + " across the top row, and then placing sticks in the center and bottom middle"
                                + " squares in a crafting table.");
    }
    
    public static String get(String item) {
        return recipes.get(item);
    }
    
}