#!/bin/bash

# Move to projects basedir
cd "$(dirname "$0")"

# Generate Slides
mvn -s .m2/settings.xml process-resources