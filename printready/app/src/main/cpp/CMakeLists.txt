cmake_minimum_required(VERSION 3.22.1)
project(printready_engine)

add_library(printready_engine SHARED engine.c)

find_library(log-lib log)
target_link_libraries(printready_engine ${log-lib})
