This is a Giter8 template for Freestyle projects.

## Creating New Freestyle Project

1. Create a new project from Freestyle g8 template:

```scala
sbt new frees-io/freestyle-template.g8
```

2. Fill the required information (you can see an example below):

```bash

...

name [Project Name]: Test
projectDescription [Project Description]:
project [project-name]: freestyle-new-project
package [freestyle]:

Template applied in ./test
```

The new project will be created in the `test` folder, with the basic structure and basic sbt configuration based on the `sbt-freestyle` and `sbt-org-policies` plugins.

3. Create the organization files, to do so, from the project folder, you could just run:

```scala
sbt orgCreateFiles
```

Template license
----------------
Written in 2017 by 47 Degrees

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.
