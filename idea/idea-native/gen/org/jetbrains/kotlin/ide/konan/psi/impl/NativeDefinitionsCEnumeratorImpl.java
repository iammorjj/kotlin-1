// This is a generated file. Not intended for manual editing.
package org.jetbrains.kotlin.ide.konan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jetbrains.kotlin.ide.konan.psi.NativeDefinitionsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.kotlin.ide.konan.psi.*;

public class NativeDefinitionsCEnumeratorImpl extends ASTWrapperPsiElement implements NativeDefinitionsCEnumerator {

  public NativeDefinitionsCEnumeratorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NativeDefinitionsVisitor visitor) {
    visitor.visitCEnumerator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NativeDefinitionsVisitor) accept((NativeDefinitionsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NativeDefinitionsCConstantExpression getCConstantExpression() {
    return findChildByClass(NativeDefinitionsCConstantExpression.class);
  }

  @Override
  @NotNull
  public NativeDefinitionsCEnumerationConstant getCEnumerationConstant() {
    return findNotNullChildByClass(NativeDefinitionsCEnumerationConstant.class);
  }

}
