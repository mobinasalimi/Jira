package view;

import model.User;
import view.*;

public abstract class AbstractMenu {

    public abstract String getName();

    public abstract void run(User user);
}
