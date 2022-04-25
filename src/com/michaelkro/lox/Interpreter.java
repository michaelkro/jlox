package com.michaelkro.lox;

class Interpreter implements Expr.Visitor<Object> {
  private Object evaluate(Expr expr) {
    return expr.accept(this);
  }

  @Override
  public Object visitGroupingExpr(Expr.Grouping expr) {
    return evaluate(expr.expression);
  }

  @Override
  public Object visitLiteralExpr(Expr.Literal expr) {
    return expr.value;
  }
}
