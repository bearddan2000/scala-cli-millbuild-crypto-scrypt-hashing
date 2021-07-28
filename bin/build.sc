import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object Spring extends ScalaModule {
    def scalaVersion = "2.12.9"

    def ivyDeps = Agg(
      ivy"org.bouncycastle:bcprov-jdk15on:1.65"
    )
}
