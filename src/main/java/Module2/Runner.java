package Module2;

import Module2.Implementation.ExecutorImp;
import Module2.Implementation.LongTask;
import Module2.Implementation.OddValidator;
import Module2.Interfaces.Executor;
import Module2.Interfaces.Task;

import java.util.List;


public class Runner {
    public void test(List<Task<Long>> intTasks) {
        Executor<Number> numberExecutor = new ExecutorImp<>();

        for (Task<Long> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new LongTask(10L), new OddValidator());

        numberExecutor.execute();

        System.out.println("Valid results:");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results:");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }
}
