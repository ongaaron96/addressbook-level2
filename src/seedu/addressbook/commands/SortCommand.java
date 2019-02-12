package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command {

  public static final String COMMAND_WORD = "sort";

  public static final String MESSAGE_USAGE = COMMAND_WORD
          + ": Sorts all persons in the address book by alphabetical order.\n"
          + "Example: " + COMMAND_WORD;

  public static final String MESSAGE_SUCCESS = "Address book sorted by name";

  @Override
  public CommandResult execute() {
    addressBook.sortList();
    return new CommandResult(MESSAGE_SUCCESS);
  }
}
