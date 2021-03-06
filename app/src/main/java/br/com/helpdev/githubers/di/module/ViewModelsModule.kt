/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Source: https://github.com/googlesamples/android-architecture-components/blob/master/GithubBrowserSample/app/src/main/java/com/android/example/github/di/ViewModelModule.kt
 */

package br.com.helpdev.githubers.di.module


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.helpdev.githubers.di.viewmodel.ViewModelKey
import br.com.helpdev.githubers.ui.frags.favrepos.FavoritesReposViewModel
import br.com.helpdev.githubers.ui.frags.favusers.FavoritesUsersViewModel
import br.com.helpdev.githubers.ui.frags.repo.RepoViewModel
import br.com.helpdev.githubers.ui.frags.repolist.RepoListViewModel
import br.com.helpdev.githubers.ui.frags.user.UserViewModel
import br.com.helpdev.githubers.ui.frags.userslist.UsersListViewModel
import br.com.helpdev.githubers.di.viewmodel.ViewModelInjectorFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelsModule {

    /**********************************************
     * ADICIONAR OS VIEWS MODELS QUE USAM DI AQUI!
     *********************************************/

    @Binds
    @IntoMap
    @ViewModelKey(FavoritesUsersViewModel::class)
    abstract fun bindFavoritesUserViewModel(favoritesUsersViewModel: FavoritesUsersViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FavoritesReposViewModel::class)
    abstract fun bindFavoritesReposViewModel(usersListViewModel: FavoritesReposViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UsersListViewModel::class)
    abstract fun bindUsersListViewModel(usersListViewModel: UsersListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RepoListViewModel::class)
    abstract fun bindRepoListViewModel(usersListViewModel: RepoListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RepoViewModel::class)
    abstract fun bindRepoViewModel(usersListViewModel: RepoViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel::class)
    abstract fun bindUserViewModel(usersListViewModel: UserViewModel): ViewModel

    // ******************

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelInjectorFactory): ViewModelProvider.Factory
}