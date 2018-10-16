package com.seongheonson.kakakoimagesearch.vo

import android.os.Parcel
import android.os.Parcelable


data class Document (
        var collection: String,
        var thumbnail_url: String,
        var image_url: String,
        var width: Int,
        var height: Int,
        var display_sitename: String,
        var doc_url: String,
        var datetime: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(collection)
        parcel.writeString(thumbnail_url)
        parcel.writeString(image_url)
        parcel.writeInt(width)
        parcel.writeInt(height)
        parcel.writeString(display_sitename)
        parcel.writeString(doc_url)
        parcel.writeString(datetime)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Document> {
        override fun createFromParcel(parcel: Parcel): Document {
            return Document(parcel)
        }

        override fun newArray(size: Int): Array<Document?> {
            return arrayOfNulls(size)
        }
    }

}
