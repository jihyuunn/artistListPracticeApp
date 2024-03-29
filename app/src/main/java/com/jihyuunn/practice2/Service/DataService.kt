package com.jihyuunn.practice2.Service

import com.jihyuunn.practice2.Model.Category
import com.jihyuunn.practice2.Model.Painting


object DataService {

    val categories = listOf(
        Category("DAVID HOCKNEY", "david"),
        Category("VAN GOGH", "gogh"),
        Category("ALEX KATZ", "katz"),
        Category("HENRI MATISSE", "matisse"),
        Category("CLAUDE MONET", "monet")
    )

    val hockney = listOf(
        Painting("HOCKNEY 1", "david1"),
        Painting("HOCKNEY 2", "david2"),
        Painting("HOCKNEY 3", "david3"),
        Painting("HOCKNEY4", "david4"),
        Painting("HOCKNEY 1", "david1"),
        Painting("HOCKNEY 2", "david2"),
        Painting("HOCKNEY 3", "david3"),
        Painting("HOCKNEY4", "david4"),
        Painting("HOCKNEY 1", "david1"),
        Painting("HOCKNEY 2", "david2"),
        Painting("HOCKNEY 3", "david3"),
        Painting("HOCKNEY4", "david4")
    )

    val katz = listOf(
        Painting("KATZ 1", "katz1"),
        Painting("KATZ 2", "katz2"),
        Painting("KATZ 3", "katz3"),
        Painting("KATZ 4", "katz4"),
        Painting("KATZ 1", "katz1"),
        Painting("KATZ 2", "katz2"),
        Painting("KATZ 3", "katz3"),
        Painting("KATZ 4", "katz4"),
        Painting("KATZ 1", "katz1"),
        Painting("KATZ 2", "katz2"),
        Painting("KATZ 3", "katz3"),
        Painting("KATZ 4", "katz4")
    )

    val gogh = listOf(
        Painting("GOGH 1", "gogh1"),
        Painting("GOGH 2", "gogh2"),
        Painting("GOGH 3", "gogh3"),
        Painting("GOGH 4", "gogh4"),
        Painting("GOGH 1", "gogh1"),
        Painting("GOGH 2", "gogh2"),
        Painting("GOGH 3", "gogh3"),
        Painting("GOGH 4", "gogh4"),
        Painting("GOGH 1", "gogh1"),
        Painting("GOGH 2", "gogh2"),
        Painting("GOGH 3", "gogh3"),
        Painting("GOGH 4", "gogh4")

    )

    val matisse = listOf(
        Painting("MATISSE 1", "matisse1"),
        Painting("MATISSE 2", "matisse2"),
        Painting("MATISSE 3", "matisse5"),
        Painting("MATISSE 4", "matisse4"),
        Painting("MATISSE 1", "matisse6"),
        Painting("MATISSE 2", "matisse1"),
        Painting("MATISSE 3", "matisse2"),
        Painting("MATISSE 4", "matisse4"),
        Painting("MATISSE 1", "matisse5"),
        Painting("MATISSE 2", "matisse6"),
        Painting("MATISSE 3", "matisse2"),
        Painting("MATISSE 4", "matisse4")

    )

    val monet = listOf(
        Painting("MONET 1", "monet1"),
        Painting("MONET 2", "monet2"),
        Painting("MONET 3", "monet3"),
        Painting("MONET 4", "monet4"),
        Painting("MONET 1", "monet1"),
        Painting("MONET 2", "monet2"),
        Painting("MONET 3", "monet3"),
        Painting("MONET 4", "monet4"),
        Painting("MONET 1", "monet1"),
        Painting("MONET 2", "monet2"),
        Painting("MONET 3", "monet3"),
        Painting("MONET 4", "monet4")

    )

    fun getCategory(category: String?) : List<Painting> {
        return when(category) {
            "DAVID HOCKNEY" -> hockney
            "VAN GOGH" -> gogh
            "ALEX KATZ" -> katz
            "HENRI MATISSE" -> matisse
            else -> monet
        }
    }
}