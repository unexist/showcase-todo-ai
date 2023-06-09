/*
This code defines a class.
The code starts by defining the package.
The code then defines the TodoBase class.
The code then defines the title variable and sets it to the given title.
The code then defines the description variable and sets it to the given description.
The code then defines the done variable and sets it to null.
The code then defines the dueDate variable and sets it to the given dueDate.
The code then defines a getTitle function that returns the title.
The code then defines a setTitle function that sets the title to the given title.
The code then defines a getDescription function that returns the description.
The code then defines a setDescription function that sets the description to the given description.
The code then defines a getDone function that returns the done variable.
The code then defines a setDone function that sets the done variable to the given done variable.
The code then defines a getDueDate function that returns the dueDate variable.
The code then defines a setDueDate function that sets the dueDate variable to the given dueDate variable. It also sets the done variable to true if the start is before the due.
*/

package dev.unexist.showcase.todo.domain.todo;    // This code defines a class

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class TodoKodezi {    // The code then defines the TodoBase class

    @NotBlank    // This code defines a class
    private String title;    // The code then defines the title variable and sets it to the given title

    @NotBlank    // This code defines a class
    private String description;    // The code then defines the description variable and sets it to the given description

    private Boolean done;    // The code then defines the done variable and sets it to null

    @NotNull    // This code defines a class
    private DueDate dueDate;    // The code then defines the dueDate variable and sets it to the given dueDate

    public String getTitle() {    // The code then defines a getTitle function that returns the title
        return title;
    }

    public void setTitle(String title) {    // The code then defines a setTitle function that sets the title to the given title
        this.title = title;
    }

    public String getDescription() {    // The code then defines a getDescription function that returns the description
        return description;
    }

    public void setDescription(String description) {    // The code then defines a setDescription function that sets the description to the given description
        this.description = description;
    }

    public Boolean getDone() {    // The code then defines a getDone function that returns the done variable
        return done;
    }

    public void setDone(Boolean done) {    // The code then defines a setDone function that sets the done variable to the given done variable
        this.done = done;
    }

    public DueDate getDueDate() {    // The code then defines a getDueDate function that returns the dueDate variable
        return dueDate;
    }

    public void setDueDate(DueDate dueDate) {    // The code then defines a setDueDate function that sets the dueDate variable to the given dueDate variable. It also sets the done variable to true if the start is before the due
        Objects.requireNonNull(dueDate, "DueDate cannot be null");

        this.dueDate = dueDate;

        if (null != dueDate.getStart() && null != dueDate.getDue()) {
            this.done = dueDate.getStart().isBefore(dueDate.getDue());
        }
    }
}

