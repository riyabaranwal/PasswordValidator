# Password Validator (Java)

A simple, console-based Java application that validates user passwords against common security rules.

The program keeps prompting the user until a valid password is entered, and provides clear feedback for each failed validation rule.

## Features

- Enforces a minimum password length of 8 characters
- Requires at least one uppercase letter
- Requires at least one digit
- Requires at least one symbol (non-alphanumeric character)
- Displays rule-specific error messages to guide the user
- Loops until a valid password is provided

## Tech Stack

- Language: Java
- Runtime: JDK 8+
- Interface: Command-line (console)

## Project Structure

```
PasswordValidator/
├── SafeLog.java
└── README.md
```

## Validation Rules

A password is considered valid only if all of the following are true:

1. Length is at least 8 characters
2. Contains at least one uppercase letter (`A-Z`)
3. Contains at least one digit (`0-9`)
4. Contains at least one symbol (for example: `!`, `@`, `#`, `%`)

## How to Run

From the project root directory, run:

```bash
javac SafeLog.java
java SafeLog
```

## Example

```text
Enter the password :
password
Password should contain atleast one uppercase letter
Password should contain atleast one digit
Password should contain atleast one symbol
Please enter the correct password

Enter the password :
Password@123
Password is valid
```

## Current Behavior Notes

- The validator prints all failed rules in one attempt.
- Input is continuously requested until a valid password is entered.
- Validation logic is implemented using helper methods in the same file.

## Future Improvements

- Add lowercase-letter validation
- Add maximum length and banned-password checks
- Add unit tests (JUnit)
- Separate validation logic into its own file/package

## Author

Developed as a Java practice project for password validation fundamentals.
