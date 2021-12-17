package io.iskaldvind.tests.presenter.details

import io.iskaldvind.tests.view.details.ViewDetailsContract

class DetailsPresenter(
    private val viewContract: ViewDetailsContract,
    private var count: Int = 0
) : PresenterDetailsContract {

    override fun setCounter(count: Int) {
        this.count = count
    }

    override fun onIncrement() {
        count++
        viewContract.setCount(count)
    }

    override fun onDecrement() {
        count--
        viewContract.setCount(count)
    }

    override fun onAttach() {

    }

    override fun onDetach() {

    }
}
