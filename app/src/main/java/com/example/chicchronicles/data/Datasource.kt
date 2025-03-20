package com.example.chicchronicles.data

import com.example.chicchronicles.R

/**
 * Datasource to provide a list of high-end luxury brand bags.
 */
class Datasource {
    fun loadFashionBrands(): List<FashionBrand> {
        return listOf(
            FashionBrand(R.string.chanel, R.string.chanel_desc, R.drawable.chanel),
            FashionBrand(R.string.dior, R.string.dior_desc, R.drawable.dior),
            FashionBrand(R.string.louis_vuitton, R.string.louis_vuitton_desc, R.drawable.louis_vuitton),
            FashionBrand(R.string.gucci, R.string.gucci_desc, R.drawable.gucci),
            FashionBrand(R.string.prada, R.string.prada_desc, R.drawable.prada),
            FashionBrand(R.string.hermes, R.string.hermes_desc, R.drawable.hermes),
            FashionBrand(R.string.burberry, R.string.burberry_desc, R.drawable.burberry),
            FashionBrand(R.string.balenciaga, R.string.balenciaga_desc, R.drawable.balenciaga),
            FashionBrand(R.string.ysl, R.string.ysl_desc, R.drawable.ysl),
            FashionBrand(R.string.givenchy, R.string.givenchy_desc, R.drawable.givenchy),
            FashionBrand(R.string.versace, R.string.versace_desc, R.drawable.versace),
            FashionBrand(R.string.valentino, R.string.valentino_desc, R.drawable.valentino),
            FashionBrand(R.string.fendi, R.string.fendi_desc, R.drawable.fendi),
            FashionBrand(R.string.mcqueen, R.string.mcqueen_desc, R.drawable.mcqueen),
            FashionBrand(R.string.offwhite, R.string.offwhite_desc, R.drawable.offwhite),
            FashionBrand(R.string.bottega, R.string.bottega_desc, R.drawable.bottega),
            FashionBrand(R.string.celine, R.string.celine_desc, R.drawable.celine),
            FashionBrand(R.string.goyard, R.string.goyard_desc, R.drawable.goyard),
            FashionBrand(R.string.jacquemus, R.string.jacquemus_desc, R.drawable.jacquemus),
            FashionBrand(R.string.maison_margiela, R.string.maison_margiela_desc, R.drawable.maison_margiela),
            FashionBrand(R.string.tom_ford, R.string.tom_ford_desc, R.drawable.tom_ford),
            FashionBrand(R.string.loro_piana, R.string.loro_piana_desc, R.drawable.loro_piana),
            FashionBrand(R.string.chloe, R.string.chloe_desc, R.drawable.chloe),
            FashionBrand(R.string.miu_miu, R.string.miu_miu_desc, R.drawable.miu_miu),
            FashionBrand(R.string.loewe, R.string.loewe_desc, R.drawable.loewe),
            FashionBrand(R.string.salvatore_ferragamo, R.string.salvatore_ferragamo_desc, R.drawable.ferragamo),
            FashionBrand(R.string.stella_mccartney, R.string.stella_mccartney_desc, R.drawable.stella_mccartney),
            FashionBrand(R.string.balmain, R.string.balmain_desc, R.drawable.balmain),
            FashionBrand(R.string.bvlgari, R.string.bvlgari_desc, R.drawable.bvlgari),
            FashionBrand(R.string.jimmy_choo, R.string.jimmy_choo_desc, R.drawable.jimmy_choo)
        )
    }
}
