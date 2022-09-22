package com.demo.android.cassiana.rickandmortycardapp.ui.fragment.list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.demo.android.cassiana.rickandmortycardapp.R
import com.demo.android.cassiana.rickandmortycardapp.model.Character
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class ListFragmentDirections private constructor() {
  private data class ActionListFragmentToDetailFragment(
    val character: Character
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_listFragment_to_detailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
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
  }

  companion object {
    fun actionListFragmentToFilterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listFragment_to_filterFragment)

    fun actionListFragmentToDetailFragment(character: Character): NavDirections =
        ActionListFragmentToDetailFragment(character)
  }
}
