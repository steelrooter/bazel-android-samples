android_library(
    name = "activity",
    srcs = ["MainActivity.java"],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    enable_data_binding = 1,
    deps = [
        "@maven//:com_android_databinding_adapters",
        "@maven//:com_android_databinding_baseLibrary",
        "@maven//:com_android_databinding_library",
        "@maven//:com_android_support_support_annotations",
        "@maven//:javax_annotation_jsr250_api",
    ],
    visibility = ["//visibility:public"],
)
