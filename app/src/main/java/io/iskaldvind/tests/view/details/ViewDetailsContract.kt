package io.iskaldvind.tests.view.details

import io.iskaldvind.tests.view.ViewContract

interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}
