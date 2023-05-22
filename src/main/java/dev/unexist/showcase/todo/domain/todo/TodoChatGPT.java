package dev.unexist.showcase.todo.domain.todo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TodoChatGPT {
    @JsonProperty("description")
    private String description;

    @JsonProperty("done")
    private boolean done;

    @JsonProperty("dueDate")
    private DueDate dueDate;

    @JsonProperty("title")
    private String title;

    public TodoChatGPT() {
        // Default constructor required for Jackson
    }

    public TodoChatGPT(String description, boolean done, DueDate dueDate, String title) {
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
        this.title = title;
    }

    // Getters and Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(DueDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Inner class for DueDate

    public static class DueDate {
        @JsonProperty("due")
        private String due;

        @JsonProperty("start")
        private String start;

        public DueDate() {
            // Default constructor required for Jackson
        }

        public DueDate(String due, String start) {
            this.due = due;
            this.start = start;
        }

        // Getters and Setters

        public String getDue() {
            return due;
        }

        public void setDue(String due) {
            this.due = due;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }
    }
}