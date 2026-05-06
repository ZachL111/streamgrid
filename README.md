# streamgrid

`streamgrid` is a Java project in data engineering. Its focus is to demonstrate event-time windows, watermarks, and late-event handling.

## Purpose

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Streamgrid Review Notes

For a quick review, compare `schema drift` with `schema drift` before reading the middle cases.

## What Is Covered

- `fixtures/domain_review.csv` adds cases for schema drift and lineage depth.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/streamgrid-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `schema drift` and `schema drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Notes

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Command

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Audit Path

The check exercises the source code and the review fixture. `baseline` is the high score at 257; `stale` is the low score at 144.

## Limits

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
