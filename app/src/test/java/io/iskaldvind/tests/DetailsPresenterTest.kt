package io.iskaldvind.tests

import io.iskaldvind.tests.presenter.details.DetailsPresenter
import io.iskaldvind.tests.view.details.ViewDetailsContract
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

//Тестируем наш Презентер
class DetailsPresenterTest {

    private lateinit var presenter: DetailsPresenter

    private val count = 10

    @Mock
    private lateinit var viewContract: ViewDetailsContract

    @Before
    fun setUp() {
        //Обязательно для аннотаций "@Mock"
        //Раньше было @RunWith(MockitoJUnitRunner.class) в аннотации к самому классу (SearchPresenterTest)
        MockitoAnnotations.initMocks(this)
        //Создаем Презентер, используя моки Репозитория и Вью, проинициализированные строкой выше
        presenter = DetailsPresenter(viewContract, count)
    }

    @Test //Проверяем работу метода onIncrement()
    fun onIncrement_Test() {
        //Вызываем у Презентера метод onIncrement()
        presenter.setCounter(5)
        presenter.onIncrement()
        //Проверяем, что у viewContract вызывается метод setCount()
        verify(viewContract, times(1)).setCount(6)
    }

    @Test //Проверяем работу метода onDecrement()
    fun onDecrement_Test() {
        //Вызываем у Презентера метод onDecrement()
        presenter.setCounter(5)
        presenter.onDecrement()
        //Проверяем, что у viewContract вызывается метод setCount()
        verify(viewContract, times(1)).setCount(4)
    }
}
