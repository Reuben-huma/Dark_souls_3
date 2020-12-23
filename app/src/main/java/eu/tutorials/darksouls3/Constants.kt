package eu.tutorials.darksouls3

object Constants
{
    const val RESULTS: String = "RESULTS"

    private val bossList = ArrayList<Boss>()

    fun getQuestions(): ArrayList<Boss>
    {
        val boss1 = Boss(1, "iudex gundry", R.drawable.iudex_gundry_trophy,"Fire", "Dark", "Bleed", "Fire")
        bossList.add(boss1)

        val boss2 = Boss(2, "Vordt of the Boreal Valley", R.drawable.vordt_of_the_boreal_valley_trophy,"Slash", "Dark", "Poison", "Slash")
        bossList.add(boss2)

        val boss3 = Boss(3, "Cursed-Rotten Greatwood", R.drawable.curse_rotted_greatwood_trophy,"Thrust", "Bleed", "Poison", "Thrust")
        bossList.add(boss3)

        val boss4 = Boss(4, "Crystal Sage", R.drawable.crystal_sage_trophy,"Magic", "Poison", "Backstab", "Poison")
        bossList.add(boss4)

        val boss5 = Boss(5, "Abyss_watchers", R.drawable.lords_of_cinder_abyss_watchers,"Toxic", "Poison", "Backstab", "Backstab")
        bossList.add(boss5)

        val boss6 = Boss(6, "Deacons of the Deep", R.drawable.deacons_of_the_deep_trophy,"Magic", "Strike", "Bleed", "Strike")
        bossList.add(boss6)

        val boss7 = Boss(7, "High Lord Wolnir", R.drawable.high_lord_wolnir_trophy,"Bracelets", "Poison", "Bleed", "Bracelets")
        bossList.add(boss7)

        val boss8 = Boss(8, "Old Demon King", R.drawable.old_demon_king_trophy,"Bleed", "Dark", "Poison", "Dark")
        bossList.add(boss8)

        val boss9 = Boss(9, "Pontiff Sulyvahn", R.drawable.pontiff_sulyvahn_trophy,"Frost", "Bleed", "Riposte", "Riposte")
        bossList.add(boss9)

        val boss10 = Boss(10, "Yhorm the Giant", R.drawable.lord_of_cinder_yhorm_the_giant,"Fire", "Storm Ruler", "Bleed", "Storm Ruler")
        bossList.add(boss10)

        val boss11 = Boss(11, "Aldritch", R.drawable.lord_of_cinder_aldritch_devourer_of_gods,"Poison", "Fire", "Toxic", "Fire")
        bossList.add(boss11)

        val boss12 = Boss(12, "Dancer of the boreal valley", R.drawable.dancer_of_the_boreal_valley_trophy,"Dark", "Poison", "Toxic", "Dark")
        bossList.add(boss12)

        val boss13 = Boss(13, "Dragonslayer armour", R.drawable.dragonslayer_armour_trophy,"Poison", "Frost", "Toxic", "Frost")
        bossList.add(boss13)

        val boss14 = Boss(14, "Oceiros the consumed king", R.drawable.oceiros_the_consumed_king_trophy,"Poison", "Lightning", "Toxic", "Lightning")
        bossList.add(boss14)

        val boss15 = Boss(15, "Champion Gundyr", R.drawable.champion_gundyr_trophy,"Bleed", "Lightning", "Toxic", "Lightning")
        bossList.add(boss15)

        val boss16 = Boss(16, "Lothric Younger Prince", R.drawable.lord_of_cinder_lothric_younger_prince,"Poison", "Frost", "Toxic", "Frost")
        bossList.add(boss16)

        val boss17 = Boss(17, "Ancient Wyvern", R.drawable.ancient_wyvern_trophy,"Plunge attack", "Bleed", "Toxic", "Plunge attack")
        bossList.add(boss17)

        val boss18 = Boss(18, "The Nameless King", R.drawable.the_nameless_king_trophy,"Poison", "Lightning", "Toxic", "Lightning")
        bossList.add(boss18)

        val boss19 = Boss(19, "Soul of Cinder", R.drawable.soul_of_cinder,"Lightning", "Fire", "Parry", "Lightning")
        bossList.add(boss19)

        return bossList
    }
}