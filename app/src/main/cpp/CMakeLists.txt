cmake_minimum_required(VERSION 3.10)

file(GLOB bzip2_src bzip/*.c)

include_directories(bzip)

add_library(
    bspatch
    SHARED
    jni.cpp
    bspatch.c
    ${bzip2_src}
)

