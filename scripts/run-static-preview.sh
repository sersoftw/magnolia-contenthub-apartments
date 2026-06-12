#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/../preview"
python3 -m http.server 8080
