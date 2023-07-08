package MokitoTest.api;

import org.example.api.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring mvc","Learn Spring","Learn to Dance");
    }
}
