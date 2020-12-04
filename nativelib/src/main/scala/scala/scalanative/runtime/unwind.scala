package scala.scalanative
package runtime

import scalanative.unsafe._

@extern
object unwind {
  //@name("scalanative_unwind_get_context")
  @name("unw_getcontext")
  def get_context(context: Ptr[Byte]): CInt = extern
  //@name("scalanative_unwind_init_local")
  @name("unw_init_local")
  def init_local(cursor: Ptr[Byte], context: Ptr[Byte]): CInt = extern
  //@name("scalanative_unwind_step")
  @name("unw_step")
  def step(cursor: Ptr[Byte]): CInt = extern
  //@name("scalanative_unwind_get_proc_name")
  @name("unw_get_proc_name")
  def get_proc_name(cursor: Ptr[Byte],
                    buffer: CString,
                    length: CSize,
                    offset: Ptr[Byte]): CInt = extern
  //@name("scalanative_unwind_get_reg")
  @name("unw_get_reg")
  def get_reg(cursor: Ptr[Byte],
              reg: CInt,
              valp: Ptr[UWord]): CInt = extern

  @name("scalanative_UNW_REG_IP")
  def UNW_REG_IP: CInt = extern
}
