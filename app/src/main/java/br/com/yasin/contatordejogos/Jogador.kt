package br.com.yasin.contatordejogos

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by larissag on 22/08/17.
 */

class Jogador(var nome: String?) : Parcelable {
    var score: Int = 0

    init {
        this.score = 0
    }

    constructor(source: Parcel) : this(
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(nome)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Jogador> = object : Parcelable.Creator<Jogador> {
            override fun createFromParcel(source: Parcel): Jogador = Jogador(source)
            override fun newArray(size: Int): Array<Jogador?> = arrayOfNulls(size)
        }
    }
}
