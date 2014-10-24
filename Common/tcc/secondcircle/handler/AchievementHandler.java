package com.tcc.secondcircle.handler;


import com.tcc.secondcircle.init.ModItems;
import com.tcc.secondcircle.reference.Names;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class AchievementHandler
{
    public static Achievement secondCirclePortal;
    public static Achievement secondCircleFly;
    public static Achievement secondCircleBat;

    public static void init() {
        //Achievements
        secondCirclePortal = new Achievement("achievement." + Names.Achievements.SECONDCIRCLEPORTAL,
                Names.Achievements.SECONDCIRCLEPORTAL, //Achievement Name
                -2, //Left/Right -/+
                1, //Up/Down -/+
                new ItemStack(ModItems.scicon, 0, 0), //Achievement Icon
                (Achievement)null) //Pre-Requisite Achievement (Achievement Name)
                .registerStat(); // Register
                //.setSpecial(); // Give Fancy Border and Purple Achievement.Get text.

        secondCircleFly = new Achievement("achievement." + Names.Achievements.SECONDCIRCLEFLY,
                Names.Achievements.SECONDCIRCLEFLY, //Achievement Name
                2, //Left/Right -/+
                1, //Up/Down -/+
                Blocks.enchanting_table, //Achievement Icon
                (Achievement)null) //Pre-Requisite Achievement (Achievement Name)
                .registerStat(); // Register
                //.setSpecial(); // Give Fancy Border and Purple Achievement.Get text.

        secondCircleBat = new Achievement("achievement." + Names.Achievements.SECONDCIRCLEBAT,
                Names.Achievements.SECONDCIRCLEBAT, //Achievement Name
                0, //Left/Right -/+
                -1, //Up/Down -/+
                new ItemStack(Items.rotten_flesh, 0, 0), //Achievement Icon
                (Achievement)null) //Pre-Requisite Achievement (Achievement Name)
                .registerStat() // Register
                .setSpecial(); // Give Fancy Border and Purple Achievement.Get text.


        //Achievement Page(s)
        AchievementPage
                .registerAchievementPage
                        (new AchievementPage("Second Circle", //Name of Achievement Page
                                new Achievement[]
                                        {       //Comma Separated List of Achievements.
                                                secondCirclePortal,
                                                secondCircleFly,
                                                secondCircleBat
                                        }
                        )
                        );
    }

}
