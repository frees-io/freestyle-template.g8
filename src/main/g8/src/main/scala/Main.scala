package $package$

import cats.implicits._

import freestyle._
import freestyle.implicits._
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await

import $package$.algebra._
import $package$.algebra.implicits._

object Main extends App {

  def program[F[_]: AlgebraM]: FreeS[F, String] =
    AlgebraM[F].hello

  println(Await.result(program[AlgebraM.Op].interpret[Future], Duration.Inf))
}
