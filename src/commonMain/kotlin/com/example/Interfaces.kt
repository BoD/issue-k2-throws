package com.example

interface ParentInterface<T> {
  @Throws(Exception::class)
  fun serializeVariables()
}

interface ChildInterface<T> : ParentInterface<T> {
  @Throws(Exception::class)
  override fun serializeVariables()
}
