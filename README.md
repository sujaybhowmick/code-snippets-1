## Good example to add abstraction to use Reader interface to provide implementation
based on StringReader, FileReader to read file contents line by line.

It also uses a Janitor class which implements the HasCleanup interface to
free any resources used when finished reading the resource, till then it caches
the file handle and reuses it.

This design is taken from the source code of
groovy <https://github.com/groovy/groovy-core> where the compiler api implements
readers to read the scripts.

