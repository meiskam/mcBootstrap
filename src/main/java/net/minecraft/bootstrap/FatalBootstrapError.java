package net.minecraft.bootstrap;

public class FatalBootstrapError extends RuntimeException
{
  public FatalBootstrapError(String reason)
  {
    super(reason);
  }
}