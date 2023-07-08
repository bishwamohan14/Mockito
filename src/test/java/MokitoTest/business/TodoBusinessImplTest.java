package MokitoTest.business;

import MokitoTest.api.TodoServiceStub;
import org.example.api.TodoService;
import org.example.business.TodoBusinessImpl;
import org.junit.Test;

import java.util.List;

public class TodoBusinessImplTest {
    @Test
    public void test(){
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToString("Dummy");

    }
}
