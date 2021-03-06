package br.com.helpdev.githubers.ui.frags.favrepos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.helpdev.githubers.databinding.FragmentFavoritesReposBinding
import br.com.helpdev.githubers.ui.InjectableBindingFragment

/**
 * A placeholder fragment containing a simple view.
 */
class FavoritesReposFragment : InjectableBindingFragment<FragmentFavoritesReposBinding, FavoritesReposViewModel>
    (FavoritesReposViewModel::class.java) {

    override fun onCreateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ) = FragmentFavoritesReposBinding.inflate(inflater, container, false)


    override fun subscribeUI(viewModel: FavoritesReposViewModel, binding: FragmentFavoritesReposBinding, savedInstanceState: Bundle?) {
    }
}


