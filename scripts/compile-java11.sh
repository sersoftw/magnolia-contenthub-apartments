#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/../java/java11-content-api"
rm -rf target/classes
mkdir -p target/classes
javac --release 11 -d target/classes $(find src/main/java -name "*.java")
echo "Java 11 API compilada correctamente."
