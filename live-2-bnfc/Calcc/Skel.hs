-- Haskell module generated by the BNF converter

module Calcc.Skel where

import qualified Calcc.Abs

type Err = Either String
type Result = Err String

failure :: Show a => a -> Result
failure x = Left $ "Undefined case: " ++ show x

transExp :: Calcc.Abs.Exp -> Result
transExp x = case x of
  Calcc.Abs.EAdd exp1 exp2 -> failure x
  Calcc.Abs.ESub exp1 exp2 -> failure x
  Calcc.Abs.EMul exp1 exp2 -> failure x
  Calcc.Abs.EDiv exp1 exp2 -> failure x
  Calcc.Abs.EInt integer -> failure x
