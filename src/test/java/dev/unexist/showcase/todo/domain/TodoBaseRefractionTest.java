package dev.unexist.showcase.todo.domain;

import dev.unexist.showcase.todo.domain.todo.DueDate;
import dev.unexist.showcase.todo.domain.todo.TodoBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoBaseRefractionTest {

    @Test
    public void testSetTitle() {
        TodoBase todo = new TodoBase();
        todo.setTitle("Test Title");
        Assertions.assertEquals("Test Title", todo.getTitle());
    }

    @Test
    public void testSetDescription() {
        TodoBase todo = new TodoBase();
        todo.setDescription("Test Description");
        Assertions.assertEquals("Test Description", todo.getDescription());
    }

    @Test
    public void testSetDone() {
        TodoBase todo = new TodoBase();
        todo.setDone(true);
        Assertions.assertTrue(todo.getDone());
    }

    @Test
    public void testSetDueDate() {
        TodoBase todo = new TodoBase();
        DueDate dueDate = new DueDate();
        dueDate.setStart("2022-01-01");
        dueDate.setDue("2022-01-02");
        todo.setDueDate(dueDate);
        Assertions.assertEquals(dueDate, todo.getDueDate());
        Assertions.assertTrue(todo.getDone());
    }

    @Test
    public void testSetDueDateNull() {
        TodoBase todo = new TodoBase();
        Assertions.assertThrows(NullPointerException.class, () -> todo.setDueDate(null));
    }

    @Test
    public void testSetTitleBlank() {
        TodoBase todo = new TodoBase();
        Assertions.assertThrows(javax.validation.ConstraintViolationException.class, () -> todo.setTitle(""));
    }

    @Test
    public void testSetDescriptionBlank() {
        TodoBase todo = new TodoBase();
        Assertions.assertThrows(javax.validation.ConstraintViolationException.class, () -> todo.setDescription(""));
    }

    @Test
    public void testSetDueDateNullStart() {
        TodoBase todo = new TodoBase();
        DueDate dueDate = new DueDate();
        dueDate.setDue("2022-01-02");
        todo.setDueDate(dueDate);
        Assertions.assertFalse(todo.getDone());
    }

    @Test
    public void testSetDueDateNullDue() {
        TodoBase todo = new TodoBase();
        DueDate dueDate = new DueDate();
        dueDate.setStart("2022-01-01");
        todo.setDueDate(dueDate);
        Assertions.assertFalse(todo.getDone());
    }

    @Test
    public void testSetDueDateStartAfterDue() {
        TodoBase todo = new TodoBase();
        DueDate dueDate = new DueDate();
        dueDate.setStart("2022-01-02");
        dueDate.setDue("2022-01-01");
        todo.setDueDate(dueDate);
        Assertions.assertFalse(todo.getDone());
    }
}
