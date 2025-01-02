#!/bin/bash

# Move to projects basedir
cd "$(dirname "$0")"

# Generate Slides
mvn revealjs-server:serve