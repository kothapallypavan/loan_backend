# Note

## Code Formatting

If you are using Intellij, Eclipse, etc. visit the link below to use google-java-format:
[Google-Java-Format](https://github.com/google/google-java-format)

For vscode the.vscode folder has all configuration

## Envirnoment File

    add a .env file at the root of the project at your local setup with following contents: 

    DATABASE_URL=jdbc:mysql://localhost:3306/loan
    DATABASE_USERNAME=root
    DATABASE_PASSWORD=examly
    JWT_SECRET=secret

## Folder Details

    /controllers     : Write the files regarding controllers in this
    /filters     : Write the files regarding filters here
    /models  : Model classes should be here
    /repositories    :Repositories of Database models here
    /request     : All request related files like request validation classes , request params details , etc.
    /response    :All response related files like request validation classes , request params details , etc.
    /services    :Services to be stored here
    /util    : miscellaneous stuff here