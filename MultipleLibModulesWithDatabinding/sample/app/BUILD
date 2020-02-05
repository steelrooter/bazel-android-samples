MANIFEST_VALUES = {
    "versionCode": "1",
    "versionName": "1.0",
    "minSdkVersion": "21",
    "targetSdkVersion": "29",
}

android_binary(
    name = "app",
    crunch_png = False,
    enable_data_binding = 1,
    manifest = "AndroidManifest.xml",
    manifest_values = MANIFEST_VALUES,
    deps = [
       "//sample/code/java/com/xachin/bazel/activity:activity",
       "@maven//:com_android_databinding_adapters",
       "@maven//:com_android_databinding_library",
       "@maven//:com_android_databinding_baseLibrary",
       "@maven//:com_android_support_support_annotations",
       "@maven//:javax_annotation_jsr250_api",
    ],
    custom_package = "com.xachin.bazel.sample",
)
