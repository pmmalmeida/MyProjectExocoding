package com.pudim.flan.model.myfolder;

import javax.annotation.processing.Generated;
import lombok.Getter;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
public enum Enum1 {
  E1(0);

  Enum1(int value) {
    this.value = value;
  }

  @Getter private final int value;

  public static Enum1 of(int value) {
    for (Enum1 v : values()) {
      if (v.value == value) {
        return v;
      }
    }
    return null;
  }
}
