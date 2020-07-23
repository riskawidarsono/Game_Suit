import android.os.CpuUsageInfo
import android.util.Log

class Pemain : IPemain {
    override val permainan: MutableList<String>
        get() = mutableListOf<String>("Gunting", "Batu", "Kertas")
    var output = ""

    override fun hasil(player1: String, player2: String): String {

        if (player1.isEmpty() || player2.isEmpty()) {
            output = "Silahkan Masukan Pilihan"
        }
        if (player1 == permainan[0] && player2 == permainan[1] ||
            player1 == permainan[2] && player2 == permainan[0] ||
            player1 == permainan[1] && player2 == permainan[2]
        ) {
            output = "Pemain 2 Menang"
        } else if (
            player1 == permainan[0] && player2 == permainan[2] ||
            player1 == permainan[2] && player2 == permainan[1] ||
            player1 == permainan[1] && player2 == permainan[0]
        ) {
            output = "Pemain 1 Menang"

        } else if (
            player1 == permainan[0] && player2 == permainan[0] ||
            player1 == permainan[1] && player2 == permainan[1] ||
            player1 == permainan[2] && player2 == permainan[2]
        ) {
            output = "Hasil DRAW"
        } else {
            output = " Silahkan Masukan Pilihan "
        }
        println(output)
        Log.d("riska", "pemanang : $output")
        return output
    }

    fun hasilCpu(player1: String): String {
        val Cpu = permainan.random()

        if (player1.isEmpty() || Cpu.isEmpty()) {
            output = "Silahkan Masukan Pilihan"
        }
        if (player1 == permainan[0] && Cpu == permainan[1] ||
            player1 == permainan[2] && Cpu == permainan[0] ||
            player1 == permainan[1] && Cpu == permainan[2]
        ) {
            output = "Cpu Menang"
        } else if (
            player1 == permainan[0] && Cpu == permainan[2] ||
            player1 == permainan[2] && Cpu == permainan[1] ||
            player1 == permainan[1] && Cpu == permainan[0]
        ) {
            output = "Pemain 1 Menang"

        } else if (
            player1 == permainan[0] && Cpu == permainan[0] ||
            player1 == permainan[1] && Cpu == permainan[1] ||
            player1 == permainan[2] && Cpu == permainan[2]
        ) {
            output = "Hasil DRAW"
        } else {
            output = " Silahkan Masukan Pilihan "
        }
        println(output)
        Log.d("riska", "pemanang : $output()")
        return output
    }


}