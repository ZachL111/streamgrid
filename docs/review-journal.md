# Review Journal

The repository goal stays the same: demonstrate event-time windows, watermarks, and late-event handling. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its data engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `schema drift`, score 257, lane `ship`
- `stress`: `lineage depth`, score 224, lane `ship`
- `edge`: `partition skew`, score 177, lane `ship`
- `recovery`: `quality gap`, score 184, lane `ship`
- `stale`: `schema drift`, score 144, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
