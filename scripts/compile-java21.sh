#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/../java/java21-content-api"
rm -rf target/classes
mkdir -p target/classes
javac --release 21 -d target/classes $(find src/main/java -name "*.java")
echo "Java 21 API compilada correctamente."
