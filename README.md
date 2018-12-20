# java11-category-theory-powerset-poset-product

Preliminary info (with basic intuitions) about product 
(category theory): https://github.com/mtumilowicz/java11-category-theory-set-product

# intersection of sets is a Product in Powerset Poset Category
PowerSet Poset Category - all subsets of a given set
with morphisms: `A -> B <=> A c B`

we will sketch proof that `A n B` (intersection)
has universal property:

* there exists projections (we cannot give explicit
formulas, but we know that they exists and its sufficient
for us):
    * fst: `(A n B) c A => (A n B) -> A`
    * snd: `(A n B) c B => (A n B) -> B`

Suppose there is another product `P'` (with projections `f1`, `f2`),
therefore:
* `P' -> A => P' c A`
* `P' -> B => P' c B`
* so there exists morphism `g`, because 
    ```
    P' c (A n B) => P' -> (A n B)
    ```
    (and `P' -> (A n B)` is unique,
as in any poset there is at most one arrow between any two 
objects)
* factorization of projections is satisfied as well 
(at most one arrow between any two objects)