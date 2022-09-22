package com.demo.android.cassiana.rickandmortycardapp.ui.fragment.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.demo.android.cassiana.rickandmortycardapp.model.Character
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailFragmentArgs(
  val character: Character
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Character::class.java)) {
      result.putParcelable("character", this.character as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Character::class.java)) {
      result.putSerializable("character", this.character as Serializable)
    } else {
      throw UnsupportedOperationException(Character::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __character : Character?
      if (bundle.containsKey("character")) {
        if (Parcelable::class.java.isAssignableFrom(Character::class.java) ||
            Serializable::class.java.isAssignableFrom(Character::class.java)) {
          __character = bundle.get("character") as Character?
        } else {
          throw UnsupportedOperationException(Character::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__character == null) {
          throw IllegalArgumentException("Argument \"character\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"character\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__character)
    }
  }
}
