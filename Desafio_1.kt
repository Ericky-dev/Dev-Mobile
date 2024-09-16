fun main() {
    println("Desafio_1  - Cálculo da Pegada de Carbono ")
    println(" ========================================================= ")
    println("Sabendo do Consumo de Eletricidade = 100kw/m³")
    println("Sabendo que o Consumo de Gás = 50kw/m³ ")
    println()
    println("Fator de Emissão da Eletricidade da Rede: 0,475 kg CO₂/kWh")
    println("Fator de Emissão de Gás Natural: 2.0 kg CO2/m3")
    println()
    println("Pegada de Carbono da Eletricidade = Consumo de Energia x Fator de Emissão Pegada de Carbono")
    println("Pegada de Carbono do Gás Natural = Consumo de Gás Natural x Fator de Emissão Gás Natual ")
    println(" ========================================================= ")

    println(" ")

    val Consumo_de_Energia: Double = 100.0
    val Consumo_Gas: Double = 50.0
    val FatorDeEmissaoEletricidade: Double = 0.475
    val FatorDeEmissaoGasNatural: Double = 2.0
    var resultado_1: Double = 0.0
    var resultado_2: Double = 0.0
    var Total: Double

    do {

        println("Por Favor Informe o Tipo de Energia ")
        println(" ")
        println("Digite 1 para Eletricidade - \n" +
                "2 para Gás Natural - \n" +
                "3 Para Saber a Pegada de Carbono Total \n" +
                "ou 4 Para Encerrar o Programa")

        val x = readLine()?.toIntOrNull() ?: 0

        when (x) {
            1 -> {

                resultado_1 = Consumo_de_Energia * FatorDeEmissaoEletricidade
                println("Você Escolheu Eletricidade ")
                if (resultado_1 > 0) {
                    print("Pegada de Carbono : ${resultado_1} Kg CO²/kmh")
                    println()
                }
                println()

            }

            2 -> {

                resultado_2 = Consumo_Gas * FatorDeEmissaoGasNatural
                println("Você Escolheu Gás Natural ")
                if (resultado_2 > 0) {
                    print("Pegada de Carbono : ${resultado_2} Kg CO²/kmh")
                    println()
                }
                println()
            }

            3 -> {
                // Calcular as pegadas de carbono para eletricidade e gás antes de somá-las
                resultado_1 = Consumo_de_Energia * FatorDeEmissaoEletricidade
                resultado_2 = Consumo_Gas * FatorDeEmissaoGasNatural
                Total = (resultado_1 + resultado_2)
                println(
                    "A Pegada Total de Carbono Emitido pela Eletricidade e o Gás Narual é %.2f: kg CO2".format(
                        Total
                    )
                )
                println()
            }

            4 ->{

                    println("Encerrando o Programa ")

                }


            else -> println("Tipo de Energia Inválido !!!")

        }

    } while (x != 4 ) // continua o Loop até que x seja diferente de 4
}


