# Sub-module with Databinding enabled

This is just a simple one screen app which just have dependency on Databinding (but doesn't actually use it).
There are two targets and both of them depend on Databinding.

## Prerequisites
- Bazel built with Databinding patch
- Android Tools built with Databinding patch
- The following build flags:

  --android_databinding_use_v3_4_args
  --experimental_android_databinding_v2
  --override_repository=android_tools=/tmp/android_tools
  --java_header_compilation=false
  